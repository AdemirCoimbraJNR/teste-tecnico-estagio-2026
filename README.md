# Teste Técnico - Estágio 2026

Resolução dos 3 desafios em Java. Levei aproximadamente 2h30 para concluir tudo.

---

## Desafio 1 — Agrupar e Contar (String)

### Como resolvi
Usei um loop percorrendo a string a partir do índice 1, comparando cada letra com a anterior. Se forem iguais incremento o contador, se forem diferentes reinicio para 1. Sempre que o contador bate o recorde, salvo a letra e o valor.

### Complexidade
- **Tempo:** O(n)
- **Memória:** O(1)

### Casos de teste
| Entrada | Saída |
|---|---|
| `aaabbbbbcc` | b, 5 |
| `a` | a, 1 |
| `abbbbaa` | b, 4 |

---

## Desafio 2 — Dois Números que Somam Alvo

### Como resolvi
Dois loops aninhados comparando cada par de elementos. Quando a soma bate o target, mostro os índices e paro a busca. Adicionei validação para impedir números negativos.

### Complexidade
- **Tempo:** O(n²)
- **Memória:** O(1)

### Casos de teste
| Entrada | Target | Saída |
|---|---|---|
| `[2, 7, 11, 15]` | 9 | (0, 1) |
| `[1, 3, 2, 2, 4]` | 4 | (0, 1) |
| `[3, 5, 2, 8]` | 10 | (1, 3) |

---

## Desafio 3 — Ordenação de Nomes

### Como resolvi
Implementei o Bubble Sort comparando os sobrenomes de cada par de nomes vizinhos com `.compareTo()`. Em caso de empate no sobrenome, comparo pelo primeiro nome. Usei `.split()` para separar as partes do nome, o que permite suporte a nomes compostos.

### Complexidade
- **Tempo:** O(n²)
- **Memória:** O(1)

### Casos de teste
| Entrada | Saída |
|---|---|
| `["Maria Silva", "João Pereira", "Ana Souza", "João Silva", "Ana Lima"]` | `["Ana Lima", "João Pereira", "João Silva", "Maria Silva", "Ana Souza"]` |
| `["Carlos Souza", "Ana Souza"]` | `["Ana Souza", "Carlos Souza"]` |
| `["Ana Maria Costa Silva", "João Silva"]` | `["Ana Maria Costa Silva", "João Silva"]` |
