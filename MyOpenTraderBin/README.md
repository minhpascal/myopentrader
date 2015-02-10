# MyOpenTrader
Welcome to the MyOpenTrader Source repository. 


```
Copyright (C) 2015 Stephan Grotz - stephan@myopentrader.org
Feb 2015 - v0.1-alpha
```


Thanks for showing interest in MyOpenTrader (MOT). MOT is (yet another) a complex-event based open-source trading-engine, which is free to use for everyone. I have started MOT in 2012 and I have been using MOT ever since successfully. The best way of describing MOT is a flexible open-source trading framework. It is built from ground up as a parallel computing engine, which allows to do large scale parallel backtesting.  
MOT is distributed under the GPL v3 License and is free to use for everyone without warranty. MyOpenTrader.org is not responsible for any of your trading losses and can not be held accountable. Use the framework at your OWN risk.

 
 
IMPORTANT LINKS:
* [MyOpentrader.org] (http://www.myopentrader.org)
* [wiki.myopentrader.org] (http://wiki.myopentrader.org)
* [forum.myopentrader.org] (http://forum.myopentrader.org)
* [Download the binaries from Sourceforge] (https://sourceforge.net/projects/myopentrader/files/)
* [Download the sources from Github] (https://github.com/sgrotz/myopentrader)


REQUIREMENTS:
* To compile the sources: Fork of the TA4J Library - see [https://github.com/sgrotz/ta4j]
* MySQL Server installed and configured.
* Java 1.6++

  
CONTENT INFORMATION - directory structure:
* javadoc:	Contains the development api, useful for your own development
* bin: 		Contains all of the binary scripts, such as startup or shutdown scripts. 
* conf: 	Contains all of the configuration files, used by MyOpenTrader.
* libs:		Contains all external libraries
* resources: 	Contains all resources, such as sql schema and default data


GETTING STARTED:
The easiest way to get started is:
* to set up your database (import the schema & default data!!)
* start the embedded broker through bin/runEmbeddedMessageBus.sh|.bat
* start the tick generator/simulator through bin/runTickGenerator.sh|.bat
* start the MyOpenTraderCore Engine through bin/startMyOpenTraderCore_daemon.bat|.sh

Happy trading :)

Take a look at the wiki for more detailed information (http://wiki.myopentrader.org)