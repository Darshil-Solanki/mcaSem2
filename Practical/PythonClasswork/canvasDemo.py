from tkinter import *

root = Tk()
c = Canvas(root, bg="lightblue", height=300, width=300)
arc = c.create_arc(50,50,100,100, start=0, extent=180, fill="green")
c.pack()
root.mainloop()
