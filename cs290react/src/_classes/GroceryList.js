import React, { Component } from "react";
import List_Grocery from "./_lists/List_Grocery";

class Grocery_List extends Component {

    /* Always use super in constructor */
    constructor(props) {
        super(props);

        /* List Array */
        this.state = {
            items: []
        };

        this.addItem = this.addItem.bind(this);
    }

    addItem(e) {
        /* If input field is not blank */
        if (this._inputElement.value !== "") {
            /* item to add to array, grab text, and unique key is time */
            var newItem = {
                text: this._inputElement.value,
                key: Date.now()
            };

            /* take previous array, add new item to array */
            this.setState((prevState) => {
                return {
                    items: prevState.items.concat(newItem)
                };
            });

            /* reset input textfield */
            this._inputElement.value = "";
        }

        /* prevent page reloading from clearing out entries */
        e.preventDefault();
    }

    render() {
        return (
            <div className="shopping_form">
                    <form onSubmit={this.addItem}>
                        <input ref={(a) => this._inputElement = a}
                               placeholder="add item to list">
                        </input>
                        <button type="submit">Submit</button>
                    </form>

                <div id="Sform">
                    <List_Grocery entries={this.state.items}/>
                </div>
            </div>
        );
    }
}

export default Grocery_List;