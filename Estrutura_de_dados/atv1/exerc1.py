"1. Faça um programa que calcule a média de três números inseridos pelo usuário"
list = []

for x in range(3):
    x = int(input(f"Digite o {x+1}° número: "))    
    list.append(x)

media = sum(list) / len(list)
print(list)
print(media)


    
