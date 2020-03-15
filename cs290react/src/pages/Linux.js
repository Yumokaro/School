import React from "react";
import SideNav from "../_classes/sidenav";

/* images */
import ubuntu_logo from "../_images/_linux_OS/ubuntu-orange.gif";
import mint_logo from "../_images/_linux_OS/Linux_Mint_logo_without_wordmark.jpg";
import manjaro_logo from "../_images/_linux_OS/Manjaro-logo.jpg";
import arch_logo from "../_images/_linux_OS/Archlinux-icon-crystal-64.jpg";

import update from "../_images/_linux_update_system/update.png";
import upgrade from "../_images/_linux_update_system/upgrade.png";

import inst01 from "../_images/_qb/1.png";
import inst02 from "../_images/_qb/2.png";
import inst03 from "../_images/_qb/3.png";
import inst04 from "../_images/_qb/4.png";
import inst05 from "../_images/_qb/5.png";
import inst06 from "../_images/_qb/6.png";
import inst07 from "../_images/_qb/7.png";
import inst08 from "../_images/_qb/8.png";
import inst09 from "../_images/_qb/9.png";


const Linux = () => (
    <>
        <SideNav className={"side"} />

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

            <div id="qbittorrent-nox" className="qbit">
                <h2>Setting up qBittorrent-nox</h2>

                <p>qBittorrent-nox is a bittorrent client used primarily on a headless system.</p>

                <p>Prior to installation, update your system.  Proceed to install the qbittorrent-nox package with:</p>
                <pre>
                    <code>
                        <p>sudo apt-get install qbittorrent-nox</p>
                    </code>
                 </pre>
                <img src={inst01}/>


                <p>When prompted, type 'y' to install the program.</p>
                <img src={inst02}/>

                <p>
                    Before starting qbittorrent-nox, it's a good idea to create a new user that will run and manage the program.  In the example, the new user will be name 'qbituser'.  Type 'y' to create the user if prompted and you may leave descriptions blank.
                </p>
                <pre>
                    <code>
                        <p>sudo adduser qbituser</p>
                    </code>
                 </pre>
                <img src={inst03}/>
                <p>Create a systemd service that will start the qbittorrent-nox daemon every time the system starts.</p>
                <pre>
                    <code>
                        <p>sudo nano /etc/systemd/system/qbittorrent.service</p>
                    </code>
                 </pre>
                <p>Copy and paste this fine code directly from the makers of qbittorrent.  Save and exit.</p>
                <pre>
                    <code>
                        <p>[Unit] {"\n"}
                            Description=qBittorrent Daemon Service{"\n"}
                            Documentation=man:qbittorrent-nox(1){"\n"}
                            Wants=network-online.target{"\n"}
                            After=network-online.target nss-lookup.target{"\n"}
                            {"\n"}
                            [Service]{"\n"}
                            # if you have systemd >= 240, you probably want to use Type=exec instead{"\n"}
                            Type=simple{"\n"}
                            User=qbtuser{"\n"}
                            ExecStart=/usr/bin/qbittorrent-nox{"\n"}
                            TimeoutStopSec=infinity{"\n"}
                            {"\n"}
                            [Install]{"\n"}
                            WantedBy=multi-user.target</p>
                    </code>
                 </pre>
                <p>Now qbittorrent-nox must be started to initialize its configuration file (settings).  To do so, run the program as the new user previously created.{"\n"}
                Switch to the other user.
                </p>
                <pre>
                    <code>
                        <p>sudo su qbituser</p>
                    </code>
                 </pre>
                <img src={inst06}/>
                <p>Run the program. Select 'y' to proceed.  After it loads, ctrl+c to quit.  This part is done.</p>
                <pre>
                    <code>
                        <p>qbittorrent-nox</p>
                    </code>
                 </pre>
                <img src={inst08}/>

                <p>Enable the service we created earlier; this will start it at system start.</p>
                <pre>
                    <code>
                        <p>sudo systemctl enable qbittorrent</p>
                    </code>
                 </pre>
                <img src={inst09}/>
            </div>
        </div>




    </>
);
export default Linux;