nomes = ["Maria", "Joao", "Abe"]
nomes_com_a = []

for nome in nomes:
    if nome.strip().startswith('A'):
        nomes_com_a.append(nome.strip())

print("Nomes que começam com 'A':")
for nome in nomes_com_a:
    print(nome)
