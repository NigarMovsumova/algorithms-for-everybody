import random


def find_min_element_index(numbers, lower_limit):
    min_element = numbers[lower_limit]
    min_element_index = lower_limit
    for i in range(lower_limit + 1, len(numbers)):
        if numbers[i] < min_element:
            min_element = numbers[i]
            min_element_index = i

    return min_element_index


def swap_elements(numbers, left_index, right_index):
    temp = numbers[left_index]
    numbers[left_index] = numbers[right_index]
    numbers[right_index] = temp


def sort_numbers(numbers):
    print(numbers)
    for i in range(0, len(numbers)):
        swap_elements(numbers, i, find_min_element_index(numbers, i))

    return numbers


if __name__ == "__main__":
    random_numbers = list(range(5))
    random.shuffle(random_numbers)
    predefined_numbers = [5, 4, 3, 2, 1]
    print(sort_numbers(random_numbers))
    print(sort_numbers(predefined_numbers))

