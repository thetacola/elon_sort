import random


def elon_sort(array):
    removals = []

    for i in range(len(array)):
        if random.randint(0, 1) == 1:  # Randomly choose to remove the element
            removals.append(i)

    removals.reverse()

    for removal in removals:
        del array[removal]


# Example usage
if __name__ == "__main__":
    vector = [1, 3, 5, 2, 4, 6]
    elon_sort(vector)
    print(vector)
