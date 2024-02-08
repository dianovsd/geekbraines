from typing import List
from Pet import Pet

class Dog(Pet):
    def __init__(self, name: str, commands: List[str]):
        super().__init__(name, commands)

    def __str__(self):
        commands_str = ', '.join(self.get_commands)
        return f"Pet. Cat. Name: {self.get_name}. Commands: {commands_str}"
