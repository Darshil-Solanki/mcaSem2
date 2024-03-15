from tkinter import *
from tkinter import messagebox
def showHello():
	messagebox.showinfo("MessageBox","Hello World!")

root = Tk()
root.title("MessageBox demo")
root.geometry("500x300")
btn = Button(root, text="Click Me!",command=showHello).pack()
root.mainloop()
