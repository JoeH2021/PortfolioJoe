#Python Autoclicker
import pyautogui
from pynput import keyboard


def click():
    pyautogui.click()


break_program = False


def on_press(key):
    global break_program
    if key == keyboard.Key.caps_lock: #Press caps lock to end the program
        print("Killed program.")
        break_program = True
        return False


def main():
    with keyboard.Listener(on_press) as listener:
        while not break_program:
            click()
        listener.join()


main()
