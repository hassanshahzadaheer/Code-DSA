import os
import shutil
import time

downloads_folder = os.path.expanduser("~/Downloads")

images_folder = os.path.join(downloads_folder, "Images")
videos_folder = os.path.join(downloads_folder, "Videos")
audios_folder = os.path.join(downloads_folder, "Audios")
pdf_folder = os.path.join(downloads_folder, "PDF")
software_folder = os.path.join(downloads_folder, "Software")

file_extensions = {
    ".jpg": images_folder,
    ".jpeg": images_folder,
    ".gif": images_folder,
    ".png": images_folder,
    ".mp4": videos_folder,
    ".mov": videos_folder,
    ".avi": videos_folder,
    ".mp3": audios_folder,
    ".wav": audios_folder,
    ".aac": audios_folder,
    ".zip": os.path.join(downloads_folder, "Project"),
    ".sql": os.path.join(downloads_folder, "Database"),
    ".pdf": pdf_folder,
    ".dmg": software_folder
}

screenshots_folder = os.path.join(downloads_folder, "Screenshots")

def move_file(file_path, destination_folder):
    # Create destination folder if it doesn't exist
    os.makedirs(destination_folder, exist_ok=True)

    # Move file to destination folder
    shutil.move(file_path, destination_folder)

    print(f"Moved {file_path} to {destination_folder}")

while True:
    for filename in os.listdir(downloads_folder):
        file_path = os.path.join(downloads_folder, filename)

        # Check if file is not a directory
        if os.path.isfile(file_path):
            # Get file extension
            file_extension = os.path.splitext(filename)[1]

            # Get destination folder based on file extension
            destination_folder = file_extensions.get(file_extension.lower())

            if destination_folder:
                move_file(file_path, destination_folder)

    # Check for new screenshots
    for filename in os.listdir(os.path.expanduser("~/Desktop")):
        file_path = os.path.join(os.path.expanduser("~/Desktop"), filename)

        # Check if file is a PNG
        if os.path.isfile(file_path) and filename.startswith("Screenshot") and filename.endswith(".png"):
            move_file(file_path, screenshots_folder)

    time.sleep(2)

print("Exiting gracefully...")
