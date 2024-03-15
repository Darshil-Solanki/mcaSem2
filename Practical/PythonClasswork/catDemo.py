from tkinter import *
root = Tk()
root.title("Cat")
root.geometry("500x5000")
c = Canvas(root, height=500, width=500)

#left ear
c.create_polygon(140,100,190,170,170,190,fill="#9B1E03",outline="black")
#right ear
c.create_polygon(360,100,310,170,330,190,fill="#9B1E03",outline="black")

#face
c.create_oval(150,150,350,350,fill="Brown")

#left eye
c.create_oval(200,200,220,220,fill="#9B1E03")
#right eye
c.create_oval(280,200,300,220,fill="#9B1E03")

#nose
c.create_polygon(250,230,235,280,265,280,fill="#9B1E03",outline="black")

#mouth
c.create_arc(270,330,230,290, start=180, extent=280)

c.pack()
root.mainloop()
