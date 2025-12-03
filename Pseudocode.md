# Pseudocode for To-Do List Manager

FUNCTION AddTask(title, description, date):
    CREATE newNode
    newNode.title = title
    newNode.description = description
    newNode.date = date
    newNode.next = NULL

    IF head == NULL:
        head = newNode
    ELSE:
        temp = head
        WHILE temp.next != NULL:
            temp = temp.next
        END WHILE
        temp.next = newNode
    END IF
END FUNCTION


FUNCTION DeleteTask(title):
    IF head == NULL:
        PRINT "List is empty"
        RETURN
    END IF

    IF head.title == title:
        head = head.next
        RETURN
    END IF

    temp = head
    WHILE temp.next != NULL AND temp.next.title != title:
        temp = temp.next
    END WHILE

    IF temp.next == NULL:
        PRINT "Task not found"
    ELSE:
        temp.next = temp.next.next
    END IF
END FUNCTION


FUNCTION MarkCompleted(title):
    temp = head
    WHILE temp != NULL:
        IF temp.title == title:
            temp.completed = TRUE
            RETURN
        END IF
        temp = temp.next
    END WHILE
    PRINT "Task not found"
END FUNCTION


FUNCTION SearchTask(keyword):
    temp = head
    WHILE temp != NULL:
        IF keyword IN temp.title OR keyword IN temp.description:
            DISPLAY temp
        END IF
        temp = temp.next
    END WHILE
END FUNCTION


FUNCTION DisplayAll():
    temp = head
    WHILE temp != NULL:
        PRINT temp.title, temp.description, temp.date, temp.completed
        temp = temp.next
    END WHILE
END FUNCTION
