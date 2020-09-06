import {BaseComponent, html} from "../../base-component.js";

const htmlTemplate = (authorList) => html`
    <link rel="stylesheet" type="text/css" href="/library/js/common/common.css">
    <h2 style="text-align: left">Authors</h2>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Country</th>
                <th>Email Address</th>
            </tr>
        </thead>
        <tbody>
            ${authorList.map(author => row(author))}
        </tbody>
    </table>
`;

const row = (author) => html`
    <tr>
        <td>${author.firstName} ${author.lastName}</td>
        <td>${author.country}</td>
        <td>${author.emailId}</td>
    </tr>
`;


export class LibAuthor extends BaseComponent {

    async load(authorList) {
        console.log(authorList);
        await this.init(htmlTemplate(authorList));
    }
}

window.customElements.define('lib-author', LibAuthor);