""" 10. Crie um programa que simule o jogo "Pedra, Papel e Tesoura" entre o usuário e o computador. O
programa deve solicitar a escolha do usuário e, em seguida, escolher aleatoriamente a escolha do
computador e determinar o vencedor. """

import random

while True:
    """Capturando escolha do usuario"""
    def get_user_opt():
        while True:
            user_opt = input("Escolha Pedra, Papel ou Tesoura: ").lower()
            if user_opt in ["pedra", "papel", "tesoura"]:
                return user_opt
            else:
                print("Escolha inválida.")
    """Capturando escolha aleatoria"""
    def escolha_aleatoria():
        opts = ["pedra", "papel", "tesoura"]
        return random.choice(opts)
    """Definindo vencedor com base nas escolhas"""
    def vencedor(user_opt, computer_opt):
        if user_opt == computer_opt:
            return "Empate"
        elif (user_opt == "pedra" and computer_opt == "tesoura") or \
            (user_opt == "papel" and computer_opt == "pedra") or \
            (user_opt == "tesoura" and computer_opt == "papel"):
            return "Você venceu!"
        else:
            return "O computador venceu!"
    """Programa principal"""
    print("Bem-vindo ao Pedra, Papel e Tesoura!")
    user_opt = get_user_opt()
    computer_opt = escolha_aleatoria()

    print(f"Você escolheu: {user_opt}")
    print(f"O computador escolheu: {computer_opt}")

    win = vencedor(user_opt, computer_opt)
    print(win)
    cont = input("Deseja continuar? (S/N)  ").upper()
    """Condiçao para saida ou novo jogo"""
    if cont == "S":
        get_user_opt
    else:
        break


    