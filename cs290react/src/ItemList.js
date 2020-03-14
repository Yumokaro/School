import React, { Component } from 'react';
class ListApp extends Component {
    constructor(props) {
        /* Always use super with constructor */
        super(props);
        this.state = {
            list: [1, 2, 3],
        };
    }


    render() {
        return (
            <div>
                <ul>
                    {this.state.list.map(item => (
                        <li key={item}>{item}</li>
                    ))}
                </ul>
            </div>
        );
    }
}
export default ListApp;