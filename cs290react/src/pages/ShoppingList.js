import React, {Component} from 'react';
import ListApp from "../ItemList";
import TodoList from "./ToDoList";


const ShoppingList = () => (
    <>
        <h1>Shopping List</h1>

        <div>
            <form className="shopping_form" onSubmit={ListApp}>
                <input/>
                <button type="submit">Add Item</button>
                <p>
                    <TodoList/>
                </p>
            </form>
        </div>

    </>
);
export default ShoppingList;
