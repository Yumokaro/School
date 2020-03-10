import React from "react";

const HomePage = () => (
    <>
        <body>
            <div id="side_Nav" className="side_nav_bar">
                <a href="javascript:void(0)" className="close_btn" onClick="close_Nav_Bar()">&times;</a>
                <a href="#">Home</a>
            </div>

            <div id="side_Nav_Icon" className="nav_bar_hamburger" onClick="open_Nav_Bar()">&#9776;Sections</div>


            <main role="main" id="main" className="main_Body">

                <p>This is a temporary page to get things together before migrating to a wordpress style blog for tech
                    tutorials.</p>
            </main>

        </body>
    </>
);
export default HomePage;