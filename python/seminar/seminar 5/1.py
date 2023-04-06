def min_max_serch(input_list):
    return min(input_list), max(input_list)


def min_max_replace(start_list, copy=True):
    if copy:
        start_list = start_list.copy()
        min_el, max_el = min_max_serch(start_list)
    while max_el in start_list:
        max_index = start_list.index(max_el)
        start_list[max_index] = min_el
    return start_list