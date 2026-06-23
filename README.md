# ⚽ Football Data Engineering Pipeline

Pipeline de Engenharia de Dados para análise de futebol, construído em Java.

## 📋 Sobre o Projeto

Este projeto simula o trabalho de um Engenheiro de Dados
analisando dados de futebol. O sistema coleta, processa
e analisa partidas e jogadores do Brasileirao Serie A.

## 🛠️ Tecnologias Utilizadas

- Java 17
- Maven
- Git

## 📁 Estrutura do Projeto
src/

main/java/com/football/

model/

Match.java     → representa uma partida

Player.java    → representa um jogador

service/

DataService.java → analisa os dados

App.java           → ponto de entrada

## 🚀 Como Executar

1. Clone o repositório
git clone https://github.com/wesleywallacemartins-a11y/football-data-engineering.git

2. Entre na pasta
cd football-data-engineering

3. Compile e execute
mvn compile exec:java -Dexec.mainClass=com.football.App

## 👨‍💻 Autor
Wesley Wallace Carvalho Martins