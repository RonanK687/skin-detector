# Convolutional Neural Networks for Skin Cancer Detection

```
Please review ResearchPaper.pdf to see the research paper.
```

At this current date, studies indicate promising results when applying artificial neural networks for image classification. However, the application to skin cancer detection is limited, and even more so is the number of successful attempts via smartphones. This study established a groundwork for creating an efficient skin cancer diagnosing smartphone application.

## Current Status

* The program in its most fundamental state is complete.
* The next step is to perform tests and optimize the neural network.
* Smartphone compatibiltiy is still under development. I plan to make it Android compatible first, and later expand to other operating systems.

## Compatibility
* Currently only tested on Windows Operating System
* Currently only tested on IntelliJ IDEA IDE

## Prerequisites

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Programming Language
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) - IDE
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) - Allows for project download
* [Maven](https://maven.apache.org/download.cgi) - Dependency Management

## Installing 

1. Use the command line to enter the following:
```
git clone https://github.com/RonanK687/skin-detector.git
cd skin-detector
mvn clean install
```

2. Select Maven when building in IntelliJ and select SDK as jdk

3. Download [ISIC-Archive of skin-cancer images](https://isic-archive.com/#images) and move all jpg and json files to a single directory and name it ISIC_Dataset. Place this directory in skin-detector directory.

## User Interface for Training your Neural Network

In order to access the local user interface, the user should run the program and type the following into your search engine of choice
```
http://localhost:9001
```

![trainingnetui](https://user-images.githubusercontent.com/10384617/38002585-05a412c2-31e8-11e8-88a4-14e03a4e4792.png)


## Author

* **Ronan Konishi**

## License

This project is licensed under the Apache License 2.0 - see [LICENSE](LICENSE) file for details. When using the images and annotations from the ISIC-archive, please abide by their [Terms Of Use](https://isic-archive.com/#termsOfUse).

## Acknowledgments

* Special thanks to The International Skin Imaging Collaboration (ISIC) for the open source database of skin cancer moles.
* Special thanks to the deeplearning4j team for their open source [artificial intelligence library](https://github.com/deeplearning4j).
