import React, { Component } from "react";
import TodoItems from "./TodoItems";

class TodoList extends Component {
    constructor(props) {
        super(props);

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
        console.log(this.state.items);
        /* prevent page reloading from clearing out entries */
        e.preventDefault();
    }

    render() {
        return (
            <div className="todoListMain">
                <div className="header">
                    <form onSubmit={this.addItem}>
                        <input ref={(a) => this._inputElement = a}
                               placeholder="enter task">
                        </input>
                        <button type="submit">add</button>
                    </form>
                </div>
                <TodoItems entries={this.state.items}/>
            </div>
        );
    }
}

export default TodoList;