# Setting up your workspace

## Part 1: Installing VSCode

Visual Studio Code is a code editor for Windows, Linux or macOS with support for many languages, as well as all sorts of tools that might come in handy when coding. Here's how to install Visual Studio Code:

- Begin by navigating to the [Visual Studio Code website](https://code.visualstudio.com/) Download and install the suitable version for your operating system.

- Documentation for installing VS Code on multiple operating systems are available [here](https://code.visualstudio.com/docs/setup/setup-overview), if you need it.

- Your Visual Studio Code should look something like this after installation:

![VS Code Screenshot](VSCode.png)

# Course-specific accounts at UCSD

Many courses at UCSD make use of course-specific accounts. Before you can make use of your course-specific account, you will have to set your password.

You can do so by looking up your course-specific account [here](https://sdacs.ucsd.edu/~icc/index.php). 

- Enter your username (the part of your UCSD email before @ucsd.edu), and your student PID (Which starts with A) to look up the course-specific accounts under your name.

![Login like so](AccountLookup.png)

- Under **"Additional Accounts"**, you can find course-specific accounts. For CSE 15L in Winter 22, you will see something like `cs15lwi22xyz` where `xyz` will be replaced by the unique letters of your course-specific account.

![Search results](wezResults.PNG)

- Now that you have the username of your course-specific account, you can proceed to set your password using [the password reset tool here](https://sdacs.ucsd.edu/~icc/password.php).

- Enter your **course-specific username** as your well as your **Student ID** once more.

![Activating your course specific account](PWReset.PNG)

- Enter your desired password as **both your Current Password and New Password**.

- Click on **Check Password**, followed by **Submit**

Your course-specific account should now be activated! You can now use it to remotely connect to the machines in the CSE building.

# Remote connection & SSH.

Often in work or school there will be good reason to work remotely by accessing files on another machine. One way to do so is by using SSH, also known as the Secure Shell protocol.

## Part 2: Remotely Connecting using SSH.

On Windows, you will first need to install OpenSSH. To do so (Steps from [Windows' tutorial here](https://docs.microsoft.com/en-us/windows-server/administration/openssh/openssh_install_firstuse)):

- Open **Settings**, select **Apps** > **Apps and Features**, then select **Optional Features**

- Scan the list to see if the OpenSSH is already installed. If not, at the top of the page, select **Add a feature**, then select and install both **OpenSSH Client** and **OpenSSH Server**

Once done, your settings page should look something like this:

![OpenSSH has been installed](OpenSSH.png)

___

We will be using Visual Studio Code to establish the remote connection. 

- First, open a VSCode Terminal (Ctrl/Command + \`, or **Terminal -> New Terminal**) and use the following command, replacing `xyz` with the letters in your course-specific account:

```
ssh cs15lwi22xyz@ieng6.ucsd.edu
```

When connecting to a server for the first time, a message like this should appear:

``` The authenticity of host 'ieng6.ucsd.edu (128.54.70.238)' can't be established.
RSA key fingerprint is SHA256:ksruYwhnYH+sySHnHAtLUHngrPEyZTDl/1x99wUQcec.
Are you sure you want to continue connecting (yes/no/[fingerprint])?
```
- Enter `yes` to proceed. Next, enter the password for your course-specific account as prompted.

```
Password:
```

Note that no extra characters will show up in the terminal as you type or paste your password. Don't worry, this is normal. Your password is still being entered as normal. The characters are merely hidden.

A successful login looks something like this:

```
Last login: Fri Jan 14 16:28:51 2022 from 100.83.33.11
quota: No filesystem specified.
Hello cs15lwi22afr, you are currently logged into ieng6-201.ucsd.edu

You are using 0% CPU on this system

Cluster Status 
Hostname     Time    #Users  Load  Averages  
ieng6-201   16:25:01   31  3.78,  3.54,  3.42
ieng6-202   16:25:01   30  6.67,  6.61,  6.66
ieng6-203   16:25:01   19  2.25,  2.62,  2.50


Fri Jan 14, 2022  4:29pm - Prepping cs15lwi22
[cs15lwi22afr@ieng6-201]:~:76$
```

Congratulations, you are now connected to one of the computers in the CSE basement! Any commands you enter now will be run on that computer (the **server**) instead of locally on your machine (the **client**).

## Part 3: Trying some commands

[hey](fwunixref.pdf)