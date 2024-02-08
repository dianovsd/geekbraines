from typing import List
from Animal import Animal

class PackAnimal(Animal):
    def __init__(self, name: str, commands: List[str]):
        super().__init__(name, commands)
