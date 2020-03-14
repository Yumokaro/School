import React, { Component } from "react";

class List_Grocery extends Component {
    /* Pull and Return item using unique key */
    createTasks(item) {
        return <li key={item.key}>{item.text}</li>
    }

    render() {
        var grocery_Item = this.props.entries;
        var list_Items = grocery_Item.map(this.createTasks);

        return (
            <ul>
                {list_Items}
            </ul>
        );
    }
}

export default List_Grocery;