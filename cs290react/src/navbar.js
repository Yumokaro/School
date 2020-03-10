import React from "react";
import {Link} from 'react-router-dom';

const NavBar = () => (
    <nav className="menu">
        <div className="menu_links">

            <Link to="/">Home</Link>

            <ul className="main_sections">
                <li>
                    <Link to="/Linux">Linux</Link>
                </li>
                <li>
                    <Link to="/Windows">Windows</Link>
                </li>
            </ul>
        </div>
    </nav>
);
export default NavBar;
