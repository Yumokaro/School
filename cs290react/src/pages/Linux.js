import React from "react";

/* images */
import ubuntu_logo from "../_images/_linux_OS/ubuntu-orange.gif";
import mint_logo from "../_images/_linux_OS/Linux_Mint_logo_without_wordmark.jpg";
import manjaro_logo from "../_images/_linux_OS/Manjaro-logo.jpg";
import arch_logo from "../_images/_linux_OS/Archlinux-icon-crystal-64.jpg";

import update from "../_images/_linux_update_system/update.png";
import upgrade from "../_images/_linux_update_system/upgrade.png";

const Linux = () => (
    <>
        <h1>Welcome to Linux</h1>

        <div className="main_Body">
            <h2 id="where_to_get_linux">Where to get Linux</h2>

            <p>There are many different linux based operating systems.  Here are a few of the popular distributions.</p>

            <div className="logos">
                <a href="https://ubuntu.com"><img src={ubuntu_logo} /></a>
                <a href="https://www.linuxmint.com/"><img src={mint_logo} /></a>
                <a href="https://manjaro.org/"><img src={manjaro_logo} /></a>
                <a href="https://www.archlinux.org/"><img src={arch_logo} /></a>
            </div>

            <h2 id="Updating Linux">Updating Linux</h2>

            <p>Updating linux is fairly similar across systems; however, not always the same.  Here will be a demonstration of updating a system             in Ubuntu.</p>


            <div id="code" className="update">
                <img src={update}/>

                <p>Update your system with the command: </p>
                <pre>
                    <code>
                        <p>sudo apt-get update</p>
                    </code>
                </pre>

                <img src={upgrade}/>
                <p>Update your system with the command: </p>
                <pre>
                    <code>
                        <p>sudo apt-get update</p>
                    </code>
                </pre>
            </div>


        </div>




    </>
);
export default Linux;