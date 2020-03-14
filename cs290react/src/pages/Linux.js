import React from "react";
import "../_images/_linux_OS/ubuntu-orange.gif";
import ubuntu_logo from "../_images/_linux_OS/ubuntu-orange.gif";
import mint_logo from "../_images/_linux_OS/Linux_Mint_logo_without_wordmark.jpg";
import manjaro_logo from "../_images/_linux_OS/Manjaro-logo.jpg";
import arch_logo from "../_images/_linux_OS/Archlinux-icon-crystal-64.jpg";

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

            <p>Updating linux is fairly similar across systems; however, not always the same.  Here will be a demonstration of updating a system             using Ubuntu.</p>


        </div>




    </>
);
export default Linux;