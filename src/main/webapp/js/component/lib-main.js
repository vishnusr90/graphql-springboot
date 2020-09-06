import {BaseComponent, html} from "../base-component.js";
import {getAllAuthors} from "../service/author-service.js";
import './lib-author/lib-author.js';
import './lib-header/lib-header.js';

const htmlTemplate = (data) => html`
    <lib-header></lib-header>
    <lib-author></lib-author>
`;

export class LibMain extends BaseComponent {
    headerEle = () => this.$$('lib-header');
    authorEle = () => this.$$('lib-author');

    async load() {
        await this.init(htmlTemplate());
        const allAuthors = await getAllAuthors();
        await this.headerEle().load();
        await this.authorEle().load(allAuthors);
    }
}

window.customElements.define('lib-main', LibMain);