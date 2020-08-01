import {BaseComponent, html} from "../base-component.js";

const htmlTemplate = () => html`
    <h1 style="text-align: center">Library</h1>
`;

export class LibMain extends BaseComponent {

    async load() {
        await this.init(htmlTemplate());
    }
}
window.customElements.define('lib-main', LibMain);