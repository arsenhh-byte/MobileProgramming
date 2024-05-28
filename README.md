# Point of Sale and Other Activities App

This Android application demonstrates a point of sale (POS) system and several other functionalities such as summarizing data using a ListView, displaying data using a RecyclerView, and manipulating strings using a StringBuffer. The application is divided into several activities, each showcasing a different aspect of Android development.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Features

- **POS Activity**: A point of sale system where users can input item quantities and prices, calculate the grand total, and apply a discount.
- **Activity 2**: Displays a summary of items using a ListView.
- **Activity 3**: Uses a StringBuffer to concatenate and display item names.
- **Activity 4**: Displays items using a RecyclerView with a custom adapter.

## Installation

1. Clone the repository to your local machine:
    ```sh
    git clone https://github.com/arsenhh-byte/MobileProgramming.git
    ```

2. Open the project in Android Studio.

3. Sync the project with Gradle files to ensure all dependencies are correctly installed.

## Usage

1. **Main Menu**: The main menu provides buttons to navigate to each activity.

2. **POS Activity**:
    - Input quantities and prices for each item.
    - Click "Calculate Grand Total" to compute the total amount.
    - Click "Apply Discount 15%" to apply a discount to the grand total.

3. **Activity 2**:
    - Displays a list of items using a ListView.

4. **Activity 3**:
    - Concatenates and displays item names using a StringBuffer.

5. **Activity 4**:
    - Displays items using a RecyclerView.

## Project Structure
pp/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── lab1/
│ │ │ ├── MainActivity.java
│ │ │ ├── POSActivity.java
│ │ │ ├── Activity2.java
│ │ │ ├── Activity3.java
│ │ │ ├── Activity4.java
│ │ │ └── RecyclerViewAdapter.java
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ ├── activity_main.xml
│ │ │ │ ├── activity_pos.xml
│ │ │ │ ├── activity_2.xml
│ │ │ │ ├── activity_3.xml
│ │ │ │ └── activity_4.xml
│ │ │ └── values/
│ │ │ └── styles.xml
│ │ ├── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── README.md


## Contributing

Contributions are welcome! Please fork the repository and use a feature branch. Pull requests are warmly welcome.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request


## Acknowledgements

- Thanks to the Android developer community for their valuable resources and tutorials.




