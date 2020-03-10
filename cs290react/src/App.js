import React, {Component} from 'react';
import {
    BrowserRouter as Router,
    Route,
} from 'react-router-dom';

import HomePage from './pages/HomePage';
import Linux from "./pages/Linux";
import Windows from "./pages/Windows";
import NavBar from "./navbar";

/*import './App.css';*/
import './_css/Menu.css';
import './_css/Page.css'


class App extends Component {
  render() {
        return (
            <Router>
                <div className="App">
                    <NavBar/>
                    <div className="horizontal_rule_top"></div>
                    <div className="pageBody">
                        <Route path="/" component={HomePage} exact />
                        <Route path="/Linux" component={Linux} />
                        <Route path="/Windows" component={Windows} />
                    </div>


                </div>
            </Router>
        );
    }
}

export default App;
