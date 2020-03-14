import React, {Component} from 'react';
import {
    BrowserRouter as Router,
    Route,
    Switch,
} from 'react-router-dom';

import HomePage from './pages/HomePage';
import Linux from "./pages/Linux";
import Windows from "./pages/Windows";
import NavBar from "./navbar";
import ShoppingList from "./pages/ShoppingList";
import TodoList from "./pages/ToDoList";
import NotFoundPage from "./pages/PageNotFound";

/*import './App.css';*/
import './_css/Menu.css';
import './_css/Page.css';
import './_css/ShoppingList.css';


class App extends Component {
  render() {
        return (
            <Router>
                <div className="App">
                    <NavBar/>
                    <div className="horizontal_rule_top"></div>

                    <div className="pageBody">
                        <Switch>
                            <Route path="/" component={HomePage} exact />
                            <Route path="/Linux" component={Linux} />
                            <Route path="/Windows" component={Windows} />
                            <Route path="/ShoppingList" component={ShoppingList} />
                            <Route path="/ToDoList" component={TodoList} />

                            <Route component={NotFoundPage} />
                        </Switch>
                    </div>
                </div>
            </Router>
        );
    }
}

export default App;
