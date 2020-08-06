import {BaseComponent, html} from "../../base-component.js";

const htmlTemplate = (authorList) => html`
    <h2 style="text-align: left">Authors</h2>
    <table>
        <thead>
            <th>Name</th>
            <th>Country</th>
            <th>Email Address</th>
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