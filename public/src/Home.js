import m from "mithril";

export default function Home() {
    return {
        view: () =>
            m("main", [
                m("h1", "Hello world"),
            ])
    }
}