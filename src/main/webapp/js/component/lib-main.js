import {BaseComponent, html} from "../base-component.js";
import {getAllAuthors} from "../service/author-service.js";
import './lib-author/lib-author.js';

const htmlTemplate = (data) => html`
    <h1 style="text-align: center">Library</h1>
    <lib-author></lib-author>
`;

export class LibMain extends BaseComponent {
    authorEle = () => this.$$('lib-author');

    async load() {
        await this.init(htmlTemplate());
        const allAuthors = await getAllAuthors();
        await this.authorEle().load(allAuthors);
    }
}

window.customElements.define('lib-main', LibMain);