import tkinter as tk

root = tk.Tk()
frame = tk.Frame(root)
frame.pack()

button = tk.Button(frame, 
                   text="Hello World", 
                   fg="red",
                   command=quit)
button.pack(side=tk.RIGHT)

root.mainloop()