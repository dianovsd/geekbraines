from typing import List

class Animal:
    def __init__(self, name: str, commands: List[str] = None):
        self.name = name
        self.commands = commands if commands else []

    def add_commands(self, commands: List[str]):
        self.commands.extend(commands)

    @property
    def get_name(self):
        return self.name

    @property
    def get_commands(self):
        return self.commands