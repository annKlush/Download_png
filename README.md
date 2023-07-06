# Download_png
Task 1:
Created a class named HttpStatusChecker with a method getStatusImage(int code) that returns the URL of the image corresponding to the given HTTP status code 
from the website https://http.cat. If the image for the code is not found, an exception is thrown.

Task 2:
Implemented a class named HttpStatusImageDownloader with a method downloadStatusImage(int code) that downloads the image corresponding
to the given HTTP status code if it exists and saves it in the current directory. If the image is not found, an exception is thrown.

Task 3:
Developed a class named HttpImageStatusCli with a method askStatus() that prompts the user to enter an HTTP status code and performs the following actions:

Checks if there is an image available for the entered status code on the website https://http.cat.
If an image exists, it downloads and saves the image.
If no image is found, it displays a message indicating the absence of an image for the entered status code.
Handles invalid user input by displaying an appropriate error message.
The HttpStatusChecker and HttpStatusImageDownloader classes were utilized within the HttpImageStatusCli class to retrieve the image URL 
and download the image, respectively.
