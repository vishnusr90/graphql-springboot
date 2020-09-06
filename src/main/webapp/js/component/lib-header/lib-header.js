import {BaseComponent, html} from "../../base-component.js";

const htmlTemplate = () => html `
    <style>
        .header {
            height: 100px;
            background: #34495e;
            padding: 0 20px;
            color: #ffffff;
            margin-top: 0px;
            text-align: center;
            line-height: normal;
        }
        .heading {
           text-transform: uppercase;
        }
    </style>
    <div class="header">
        <h2 class="heading">Library</h2>
    </div>
`;

export class LibHeader extends BaseComponent {

    load() {
        this.init(htmlTemplate());
    }
}

customElements.define('lib-header', LibHeader);