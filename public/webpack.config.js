const path = require('path')
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');
const HtmlWebpackHarddiskPlugin = require('html-webpack-harddisk-plugin');

module.exports = {
	entry: {
		bootstrap: './src/bootstrap.js',
		main: './src/app.js'
	},
	output: {
		publicPath: '/public/dist',
		path: path.resolve(__dirname, './dist'),
		filename: '[name].bundle.js'
	},
	optimization: {
		splitChunks: {
			chunks: 'all'
		}
	},
	plugins: [
    new CleanWebpackPlugin(),
    new HtmlWebpackPlugin({
      template: 'index.html',
      alwaysWriteToDisk: true
    }),
    new HtmlWebpackHarddiskPlugin()
  	],
	module: {
		rules: [
			{
				test: /\.(js|jsx)$/,
				exclude: /\/node_modules\//,
				loader: 'babel-loader'
			},
			{
				test: /\.(scss)$/,
				use: [
				{
					loader: 'style-loader'
				},
				{
					loader: 'css-loader'
				},
				{
					loader: 'postcss-loader',
					options: {
					plugins: function () {
						return [
						require('autoprefixer')
						];
					}
					}
				},
				{
					loader: 'sass-loader'
				}
				]
			}
		]
	},
	resolve: {
		extensions: ['*', '.js', '.jsx']
	}
}