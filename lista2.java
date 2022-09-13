import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;;

    public class lista2{
        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
        
        /* EXERCÍCIO 01 - 
            
            System.out.print("Quantos metros o terreno possui de frente: ");

            double frente = teclado.nextDouble();

            System.out.print("Quantos metros o terreno possui de lateral: ");

            double lateral = teclado.nextDouble();

            System.out.print("Informe o valor do metro quadrado: R$ ");

            double valor = teclado.nextDouble();

            double area = frente * lateral;
            double valor_total = area * valor;

            System.out.printf("Área total do terreno de %.2f mts de frente com %.2f mts de lateral é: %.2f mts\n", frente,lateral,area);
            if (Math.abs(frente - lateral) < 0.1 * frente){
                valor_total *= 1.22;
                System.out.printf("O terreno recebeu um acréscimo de 22%% e custará:R$ %.2f",valor_total);
            }else if(frente<0.4*lateral){
                valor_total *= 0.88;
                System.out.printf("O terreno recebeu um decréscimo de 12%% e custará:R$ %.2f", valor_total);
            }else if(frente>0.7*lateral){
                valor_total *= 0.85;
                System.out.printf("O terreno recebeu um decréscimo de 15%% e custará:R$ %.2f", valor_total);
            }else{
                System.out.printf("O terreno não recebeu nenhuma alteração e custará:R$ %.2f", valor_total);
            }

        */

        /*EXERCÍCIO 02 - 

            System.out.print("Informe o valor do salário mínimo: R$ ");

            double salarioMinimo = teclado.nextDouble();

            System.out.print("Informe o valor do salário do funcionário: R$ ");

            double salarioFuncionario = teclado.nextDouble();

            double quantSalariosMinimos = salarioFuncionario/salarioMinimo;

            if(quantSalariosMinimos<1){
                System.out.print("O funcionário ganha menos que um salário mínimo!");
            }else{
                System.out.printf("O funcionário recebe %.1f salários mínimos!",quantSalariosMinimos);
            }
        */

        /*EXERCÍCIO 03 -
             
            System.out.print("Informe o valor da primeira nota:");
             
             double nota1 = teclado.nextDouble(); 
        
             System.out.print("Informe o valor da segunda nota:");
             
             double nota2 = teclado.nextDouble();

             System.out.print("Informe o valor da terceira nota:");
             
             double nota3 = teclado.nextDouble();
             
            double mediaPonderada = (nota1 + nota2 * 2 + nota3 * 3)/6;

            System.out.printf("A média ponderada das notas %.2f %.2f %.2f é %.2f.\n",nota1,nota2,nota3,mediaPonderada);

            double nota1ComPeso = nota1;

            double nota2ComPeso = nota2 * 2;

            double nota3ComPeso = nota3 * 3;

            if (nota1ComPeso>nota3ComPeso){
                if(nota1ComPeso>nota2ComPeso){
                System.out.printf("A nota 1 (%.2f) é a maior nota após o cálculo do peso 1 (%.2f).", nota1,nota1ComPeso);
                }else if(nota1ComPeso==nota2ComPeso){
                System.out.printf("As notas 1 (%.2f) e 2 (%.2f) foram as maiores nota apos o calculo do peso 1 (%.2f) e peso 2 (%.2f).",nota1,nota2,nota1ComPeso,nota2ComPeso);
                }
            }else if (nota2ComPeso>nota1ComPeso){
                if(nota2ComPeso>nota3ComPeso){
                System.out.printf("A nota 2 (%.2f) é a maior nota após o cálculo do peso 2 (%.2f).", nota2,nota2ComPeso);
                }
                else if(nota2ComPeso==nota3ComPeso){
                   System.out.printf("As notas 2 (%.2f) e 3 (%.2f) foram as maiores nota apos o calculo do peso 2 (%.2f) e peso 3 (%.2f).",nota2,nota3,nota2ComPeso,nota3ComPeso); 
                }
            }else if (nota3ComPeso>nota1ComPeso && nota3ComPeso>nota2ComPeso){
                System.out.printf("A nota 3 (%.2f) é a maior nota após o cálculo do peso 3 (%.2f).", nota3,nota3ComPeso);
            }else if(nota1ComPeso==nota3ComPeso && nota1ComPeso>nota2ComPeso){
                System.out.printf("As notas 1 (%.2f) e 3 (%.2f) foram as maiores nota apos o calculo do peso 1 (%.2f) e peso 3 (%.2f).",nota1,nota3,nota1ComPeso,nota3ComPeso);
            }else{
                System.out.print("As três notas foram iguais.");
            }
        */

        /*EXERCÍCIO 04 -

        System.out.print("Informe a operação desejada [+,-,*,/]: ");

        char operacao = (char) System.in.read();

        System.out.print("Informe o número para o cálculo da tabuada: ");

        int numero = teclado.nextInt();

        if (operacao == '+'){
            System.out.printf("Tabuada do %s para o número %d\n",operacao,numero);
            System.out.println(numero + " + 0 = " + (numero + 0) );
            System.out.println(numero + " + 1 = " + (numero + 1) );
            System.out.println(numero + " + 2 = " + (numero + 2) );
            System.out.println(numero + " + 3 = " + (numero + 3) );
            System.out.println(numero + " + 4 = " + (numero + 4) );
            System.out.println(numero + " + 5 = " + (numero + 5) );
            System.out.println(numero + " + 6 = " + (numero + 6) );
            System.out.println(numero + " + 7 = " + (numero + 7) );
            System.out.println(numero + " + 8 = " + (numero + 8) );
            System.out.println(numero + " + 9 = " + (numero + 9) );
        }else if(operacao == '-'){
            System.out.printf("Tabuada do %s para o número %d\n",operacao,numero);
            System.out.println(numero + " - 0 = " + Math.abs(numero - 0) );
            System.out.println(numero + " - 1 = " + Math.abs(numero - 1) );
            System.out.println(numero + " - 2 = " + Math.abs(numero - 2) );
            System.out.println(numero + " - 3 = " + Math.abs(numero - 3) );
            System.out.println(numero + " - 4 = " + Math.abs(numero - 4) );
            System.out.println(numero + " - 5 = " + Math.abs(numero - 5) );
            System.out.println(numero + " - 6 = " + Math.abs(numero - 6) );
            System.out.println(numero + " - 7 = " + Math.abs(numero - 7) );
            System.out.println(numero + " - 8 = " + Math.abs(numero - 8) );
            System.out.println(numero + " - 9 = " + Math.abs(numero - 9) );
        }else if(operacao == '*'){
            System.out.printf("Tabuada do %s para o número %d\n",operacao,numero);
            System.out.println(numero + " * 0 = " + (numero * 0) );
            System.out.println(numero + " * 1 = " + (numero * 1) );
            System.out.println(numero + " * 2 = " + (numero * 2) );
            System.out.println(numero + " * 3 = " + (numero * 3) );
            System.out.println(numero + " * 4 = " + (numero * 4) );
            System.out.println(numero + " * 5 = " + (numero * 5) );
            System.out.println(numero + " * 6 = " + (numero * 6) );
            System.out.println(numero + " * 7 = " + (numero * 7) );
            System.out.println(numero + " * 8 = " + (numero * 8) );
            System.out.println(numero + " * 9 = " + (numero * 9) );
        }else if(operacao == '/'){
            System.out.printf("Tabuada do %s para o número %d\n",operacao,numero);
            System.out.println(numero + " / 0 = - " );
            System.out.println(numero + " / 1 = " + ((double)numero / 1) );
            System.out.println(numero + " / 2 = " + ((double)numero / 2) );
            System.out.println(numero + " / 3 = " + ((double)numero / 3) );
            System.out.println(numero + " / 4 = " + ((double)numero / 4) );
            System.out.println(numero + " / 5 = " + ((double)numero / 5) );
            System.out.println(numero + " / 6 = " + ((double)numero / 6) );
            System.out.println(numero + " / 7 = " + ((double)numero / 7) );
            System.out.println(numero + " / 8 = " + ((double)numero / 8) );
            System.out.println(numero + " / 9 = " + ((double)numero / 9) );
        }else{
            System.out.print("Operação digitada (" + operacao + ") incorreta!");
        }
        */

        /*EXERCÍCIO 05 -
            System.out.print("Informe o valor 1: ");

            int valor1 = teclado.nextInt();

            System.out.print("Informe o valor 2: ");
            
            int valor2 = teclado.nextInt();
            

            double divisao = 1;

            if(valor2>valor1){
                if(valor1 == 0){
                    System.out.print("A operação não pode ser realizada.");
                }else{
                    divisao = valor2/(float)valor1;
                    if(divisao==0){
                        System.out.printf("A divisão de %d por %d é ",valor2,valor1);
                        System.out.print(Math.abs(divisao));
                    }else{
                        System.out.printf("A divisão de %d por %d é %.2f",valor2,valor1,divisao);
                    }
                }
            }else if(valor1>valor2){
                if(valor2 == 0){
                    System.out.print("A operação não pode ser realizada.");
                }else{
                divisao = valor1/(float)valor2;
                if(divisao==0){
                    System.out.printf("A divisão de %d por %d é ",valor1,valor2);
                    System.out.print(Math.abs(divisao));
                }else{
                    System.out.printf("A divisão de %d por %d é %.2f",valor1,valor2,divisao);
                }

            */

            /*EXERCÍCIO 06 -
            
            System.out.print("Informe quantidade de cavalos: ");
            int quantCavalos = teclado.nextInt();

            System.out.print("Informe o valor de cada ferradura: R$ ");
            double valorFerradura = teclado.nextDouble();
            
            int ferraduraNecessaria = quantCavalos * 4;

            System.out.printf("A quantidade de ferraduras necessárias: %d\n",ferraduraNecessaria);

            double valorTotal = ferraduraNecessaria * valorFerradura;

            System.out.printf("Valor total para a compra de ferraduras: R$ %.2f",valorTotal);
            */

            /*EXERCÍCIO 07 -

            System.out.print("Informe o peso em KG: ");
            int peso = teclado.nextInt(); 
            
            double engorda15 = peso*1.15;
            System.out.println("Caso a pessoa engorde 15% ficará com: " + engorda15);

            double engorda20 = peso*1.2;
            System.out.println("Caso a pessoa engorde 20% ficará com: " + engorda20);

            if(engorda20 - engorda15 > 4.5){
                System.out.print("Você deve procurar uma nutricionista!");
            }
            */

            /*EXERCÍCIO 08 -
            double salarioInicial, salarioReajustado, descontoInss, descontoFgts, totalDescontos, salarioFinal;
            
            System.out.print("Informe o salário: ");
            salarioInicial = Math.round(teclado.nextDouble());
            
            System.out.printf("\nSalário inicial: %.2f",salarioInicial);
            
            salarioReajustado = salarioInicial*1.05f;
            System.out.printf("\nSalário Reajustado: %.2f" ,salarioReajustado);
            
            descontoInss = salarioReajustado * 0.11f;
            System.out.printf("\nDesconto de 11%% de INSS: %.2f",descontoInss);
            
            descontoFgts = salarioReajustado * 0.08f;
            System.out.printf("\nDesconto de 8%% de FGTS: %.2f", descontoFgts);

            double descontoIR = 0;

            if(salarioReajustado>=1903.98 && salarioReajustado<2826.65){
                descontoIR = salarioReajustado * 0.075;
            }else if(salarioReajustado>=2826.65 && salarioReajustado<3751.05){
                descontoIR = salarioReajustado * 0.15;
            }else if(salarioReajustado>=3751.05 && salarioReajustado<4664.68){
                descontoIR = salarioReajustado * 0.225;
            }else if(salarioReajustado>=4664.68){
                descontoIR = salarioReajustado * 0.275;
            }

            System.out.printf("\nDesconto de IR: %.2f", descontoIR);

            totalDescontos = descontoInss + descontoFgts + descontoIR ;
            System.out.printf("\nTotal de descontos de INSS + FGTS + IR: %.2f", totalDescontos);
            
            salarioFinal = salarioReajustado - totalDescontos;
            System.out.printf("\nSalário Final: %.2f", salarioFinal);

            if(salarioInicial>salarioFinal){
                System.out.print("\nO novo salário final é menor do que o salário recebido antes do aumento!");
            }
            */

            /*EXERCÍCIO 09 -

            System.out.print("Informe o valor da conta R$: ");
            double valorConta = teclado.nextDouble();
            int valordividido = (int)valorConta/3;
            double valordivididoComCentavos = valorConta/3;

            if(valordivididoComCentavos - valordividido<=0.30){
                double valorFelipe = valorConta - (2*valordividido);
                System.out.println("\nCarlos pagará: R$ " + valordividido);
                System.out.println("André pagará: R$ " + valordividido);
                System.out.printf("Felipe pagará: R$ %.2f", valorFelipe);
            }else{
                System.out.printf("\nCarlos pagará: R$ %.2f",valordivididoComCentavos);
                System.out.printf("\nAndré pagará: R$ %.2f",valordivididoComCentavos);
                System.out.printf("\nFelipe pagará: R$ %.2f",valordivididoComCentavos);
            }

            */

            /*EXERCÍCIO 10 -

            int baseMaior,baseMenor,alturaTrapezio,ladoQuadrado,alturaRetangulo,larguraRetangulo, raioCirc, baseTriangulo, alturaTriangulo;
            float areaTrapezio,areaRetangulo,areaTriangulo;
            double areaCirc, areaQuadrado;
            
            System.out.println("Área do trapézio:");
            
            System.out.print("Informe o valor da base maior: ");
            baseMaior = teclado.nextInt();
            
            System.out.print("Informe o valor da base menor: ");
            baseMenor = teclado.nextInt();
            
            System.out.print("Informe o valor da altura: ");
            alturaTrapezio = teclado.nextInt();
            
            areaTrapezio = ((baseMaior + baseMenor)*alturaTrapezio)/2;
            System.out.printf("A área do trapézio é: %.2f\n\n", areaTrapezio);
            
            System.out.println("Área do quadrado:");
            
            System.out.print("Informe o valor de um dos lados: ");
            ladoQuadrado = teclado.nextInt();
            
            areaQuadrado = Math.pow(ladoQuadrado,2);
            System.out.printf("A área do quadrado é: %.2f\n\n",areaQuadrado);
            
            System.out.println("Área do retângulo:");
            
            System.out.print("Informe o valor da largura: ");
            larguraRetangulo = teclado.nextInt();
            
            System.out.print("Informe o valor da base menor: ");
            alturaRetangulo = teclado.nextInt();
            
            areaRetangulo = larguraRetangulo * alturaRetangulo;
            System.out.printf("A área do retângulo é: %.2f\n\n",areaRetangulo);
            
            System.out.println("Área do círculo:");
            
            System.out.print("Informe o valor do raio: ");
            raioCirc = teclado.nextInt();
            
            areaCirc = Math.PI * Math.pow(raioCirc, 2) ;
            System.out.printf("A área do círculo é: %.2f\n\n",areaCirc);
            
            System.out.println("Área do triângulo:");
            
            System.out.print("Informe o valor da base: ");
            baseTriangulo = teclado.nextInt();
            
            System.out.print("Informe o valor da altura: ");
            alturaTriangulo = teclado.nextInt();
            
            areaTriangulo = (baseTriangulo * alturaTriangulo)/2f;
            System.out.printf("A área do triângulo é: %.2f",areaTriangulo);
                
            if(areaTrapezio>areaQuadrado && areaTrapezio>areaRetangulo && areaTrapezio>areaCirc && areaTrapezio>areaTriangulo){
                System.out.printf("\n\nO objeto com a maior area é o Trapézio com %.2f m^2 de área.",areaTrapezio);
            }else if(areaQuadrado>areaTrapezio && areaQuadrado>areaRetangulo && areaQuadrado>areaCirc && areaQuadrado>areaTriangulo){
                System.out.printf("\n\nO objeto com a maior area é o Quadrado com %.2f m^2 de área.",areaQuadrado);
            }else if(areaRetangulo>areaQuadrado && areaRetangulo>areaTrapezio && areaRetangulo>areaCirc && areaRetangulo>areaTriangulo){
                System.out.printf("\n\nO objeto com a maior area é o Retângulo com %.2f m^2 de área.",areaRetangulo);
            }else if(areaCirc>areaQuadrado && areaCirc>areaRetangulo && areaCirc>areaTrapezio && areaCirc>areaTriangulo){
                System.out.printf("\n\nO objeto com a maior area é o Círculo com %.2f m^2 de área.",areaCirc);
            }else if(areaTriangulo>areaQuadrado && areaTriangulo>areaRetangulo && areaTriangulo>areaCirc && areaTriangulo>alturaTrapezio){
                System.out.printf("\n\nO objeto com a maior area é o Triânuglo com %.2f m^2 de área.",areaTriangulo);
            }                
            */

            /*EXERCÍCIO 11 -

            System.out.print("Digite o mês inicial: ");
            int mesInicial = teclado.nextInt();

            System.out.print("Digite o ano inicial: ");
            int anoInicial = teclado.nextInt();

            System.out.print("Digite o mês final: ");
            int mesFinal = teclado.nextInt();

            System.out.print("Digite o ano final: ");
            int anoFinal = teclado.nextInt();

            int idadeDias = 0;

            if(anoFinal-anoInicial>1){
                idadeDias = (anoFinal-anoInicial-1)*365;
            }

            if(anoInicial==anoFinal && anoInicial>0){
                if(mesInicial<=mesFinal && mesInicial>0 && mesFinal<=12){
                    
                    if(mesInicial==1){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==2){
                        idadeDias += 28;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==3){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==4){
                        idadeDias += 30;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==5){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==6){
                        idadeDias += 30;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==7){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==8){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==9){
                        idadeDias += 30;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==10){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==11){
                        idadeDias += 30;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    if(mesInicial==12){
                        idadeDias += 31;
                        if(mesInicial<mesFinal){
                            mesInicial++;
                        }
                    }
                    
                    System.out.print("A idade desta pessoa em dias é: " + idadeDias);
                
                }else{
                    System.out.print("Impossível realizar o cálculo. Anos e/ou meses inconsistentes.");
                }
            }else if(anoFinal>anoInicial && anoInicial>0){
                if(mesInicial>0 && mesInicial<=12 && mesFinal>0 && mesFinal<=12){
                    if(mesInicial==1){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==2){
                        idadeDias += 28;
                        mesInicial++;
                    }
                    
                    if(mesInicial==3){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==4){
                        idadeDias += 30;
                        mesInicial++;
                    }
                    
                    if(mesInicial==5){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==6){
                        idadeDias += 30;
                        mesInicial++;
                    }
                    
                    if(mesInicial==7){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==8){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==9){
                        idadeDias += 30;
                        mesInicial++;
                    }
                    
                    if(mesInicial==10){
                        idadeDias += 31;
                        mesInicial++;
                    }
                    
                    if(mesInicial==11){
                        idadeDias += 30;
                        mesInicial++;
                    }
                    
                    if(mesInicial==12){
                        idadeDias += 31;
                    }

                    if(mesFinal==12){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==11){
                        idadeDias += 30;
                        mesFinal--;
                    }
                    
                    if(mesFinal==10){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==9){
                        idadeDias += 30;
                        mesFinal--;
                    }
                    
                    if(mesFinal==8){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==7){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==6){
                        idadeDias += 30;
                        mesFinal--;
                    }
                    
                    if(mesFinal==5){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==4){
                        idadeDias += 30;
                        mesFinal--;
                    }
                    
                    if(mesFinal==3){
                        idadeDias += 31;
                        mesFinal--;
                    }
                    
                    if(mesFinal==2){
                        idadeDias += 28;
                        mesFinal--;
                    }
                    
                    if(mesFinal==1){
                        idadeDias += 31;
                    }
                    System.out.print("A idade desta pessoa em dias é: " + idadeDias);
                }else{
                    System.out.print("Impossível realizar o cálculo. Anos e/ou meses inconsistentes.");
                }
            }else{
                System.out.print("Impossível realizar o cálculo. Anos e/ou meses inconsistentes.");
            }
            */

            /*EXERCÍCIO 12 -

            System.out.print("Digite a quantidade de litros de suco necessária: ");
            double qtdSuco = teclado.nextDouble();
            
            System.out.print("Digite o percentual(%) de concentração de água: ");
            
            double percentualAgua = teclado.nextDouble();
        
            System.out.print("Digite o percentual(%) de concentração de suco: ");

            double percentualSucoConc = teclado.nextDouble();

            double qtdAgua = (percentualAgua/100)*qtdSuco;
            
            double qtdSucoConc = (percentualSucoConc/100)*qtdSuco;

            if(percentualAgua + percentualSucoConc != 100){
                System.out.print("Os valores de concentração não totalizam 100%. Deseja enquadrar os valores em escala de 100% [s|n]?: ");
                char resposta = (char) System.in.read();
                if(resposta=='s'){
                    double novoPercentualSucoConc = (percentualSucoConc*100)/(percentualAgua+percentualSucoConc);
                    System.out.printf("Novo percentual de Suco: %.2f\n",novoPercentualSucoConc);
                    
                    double novoPercentualAgua = (percentualAgua*100)/(percentualAgua+percentualSucoConc);
                    System.out.printf("Novo percentual de Água: %.2f\n",novoPercentualAgua);
                    
                    qtdAgua = (novoPercentualAgua/100)*qtdSuco;
                    
                    qtdSucoConc = (novoPercentualSucoConc/100)*qtdSuco;
                    
                    System.out.printf("\nSerá necessário para fazer %.2f lts de suco de maracujá: %.2f lts de água e %.2f lts de suco concentrado de maracujá", qtdSuco,qtdAgua,qtdSucoConc);
                }else if(resposta=='n'){
                    System.out.print("Valores de concentracao incorretos. Processo finalizado!");
                }
            }else{
                System.out.printf("Seré necessário para fazer %.2f lts de suco de maracujá: %.2f lts de agua e %.2f lts de suco concentrado de maracujá", qtdSuco,qtdAgua,qtdSucoConc);
            }
            */

            /*EXERCÍCIO 13 - 

		    System.out.print("Digite a quantidade de frangos: ");
		    int qtdeFrango = teclado.nextInt();

            System.out.print("Digite o valor do chip de alimentacao R$: ");
		    double valorChipAlimentacao = teclado.nextDouble();
		
            System.out.print("Digite o valor do chip de identificação R$: ");
		    double valorChipIdentificacao = teclado.nextDouble();

            //double valorTotal = 2*qtdeFrango*valorChipAlimentacao + qtdeFrango*valorChipIdentificacao;

            int quantidadeChipIdentificacao = qtdeFrango;

            int quantidadeChipAlimentacao = qtdeFrango*2;
            
            double gastoChipAlimentacao = quantidadeChipAlimentacao*valorChipAlimentacao;

            double gastoChipIdentificacao = quantidadeChipIdentificacao * valorChipIdentificacao;

            double valorTotal = 0;

            if(valorChipAlimentacao>valorChipIdentificacao){
                if(valorChipAlimentacao-valorChipIdentificacao<=0.2*valorChipAlimentacao){
                    double quantidadeChipIdentificacaoAumentada = quantidadeChipIdentificacao*1.2;
                    System.out.printf("\nA quantidade do chip de identificação sofreu aumento de 20%% de (%d unidades) para (%.2f unidades)",quantidadeChipIdentificacao,quantidadeChipIdentificacaoAumentada);
                    
                    double gastoAdicionalChipIdentificacao = gastoChipIdentificacao*0.2;
                    
                    valorTotal = gastoChipAlimentacao+gastoChipIdentificacao+gastoAdicionalChipIdentificacao;
                    
                    System.out.printf("\nO valor total para identificar os frangos é: Chip Alimentação = R$ %.2f Chip Identificação = R$ %.2f Adicional 20%% = R$ %.2f Valor Total = R$ %.2f", gastoChipAlimentacao,gastoChipIdentificacao,gastoAdicionalChipIdentificacao,valorTotal);
                }else{
                    valorTotal = gastoChipAlimentacao+gastoChipIdentificacao;
                    
                    System.out.printf("\nO valor total para identificar os frangos é: Chip Alimentação = R$ %.2f Chip Identificação = R$ %.2f Valor Total = R$ %.2f", gastoChipAlimentacao,gastoChipIdentificacao,valorTotal);
            }
            }else if((valorChipAlimentacao<valorChipIdentificacao)){ 
                if(valorChipIdentificacao-valorChipAlimentacao<=0.2*valorChipIdentificacao){
                    double quantidadeChipAlimentacaoAumentada = quantidadeChipAlimentacao*1.2;
                    System.out.printf("\nA quantidade do chip de alimentação sofreu aumento de 20%% de (%d unidades) para (%.2f unidades)",quantidadeChipAlimentacao,quantidadeChipAlimentacaoAumentada);
                    

                    double gastoAdicionalChipAlimentacao = gastoChipAlimentacao*0.2;

                    valorTotal = gastoChipAlimentacao + gastoChipIdentificacao + gastoAdicionalChipAlimentacao;
                    
                    System.out.printf("\n O valor total para identificar os frangos é: Chip Alimentação = R$ %.2f Chip Identificação = R$ %.2f Adicional 20%% = R$ %.2f Valor Total = R$ %.2f", gastoChipAlimentacao,gastoChipIdentificacao,gastoAdicionalChipAlimentacao,valorTotal);
                }else{
                    valorTotal = gastoChipAlimentacao+gastoChipIdentificacao;
                    
                    System.out.printf("\nO valor total para identificar os frangos é: Chip Alimentação = R$ %.2f Chip Identificação = R$ %.2f Valor Total = R$ %.2f", gastoChipAlimentacao,gastoChipIdentificacao,valorTotal);
                    }
            }else{
                valorTotal = gastoChipAlimentacao+gastoChipIdentificacao;
                
                System.out.printf("\nO valor total para identificar os frangos é: Chip Alimentação = R$ %.2f Chip Identificação = R$ %.2f Valor Total = R$ %.2f", gastoChipAlimentacao,gastoChipIdentificacao,valorTotal);
            }
            */

            /*EXERCÍCIO 14 -

            System.out.print("Digite o dia final: ");
            int dia = teclado.nextInt();

            System.out.print("Digite o mês final: ");
            int mes = teclado.nextInt();

            int quantDias = dia;

            if(dia>0 && (((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia<32)||(mes==2 && dia<29) || ((mes==4 || mes==6 || mes==9 || mes==11) && dia<31))){
                if(mes-1==11){
                    quantDias += 30;
                    mes--;
                }
                
                if(mes-1==10){
                    quantDias += 31;
                    mes--;
                }
                
                if(mes-1==9){
                    quantDias += 30;
                    mes--;
                }
                
                if(mes-1==8){
                    quantDias += 31;
                    mes--;
                }
                
                if(mes-1==7){
                    quantDias += 31;
                    mes--;
                }
                
                if(mes-1==6){
                    quantDias += 30;
                    mes--;
                }
                
                if(mes-1==5){
                    quantDias += 31;
                    mes--;
                }
                
                if(mes-1==4){
                    quantDias += 30;
                    mes--;
                }
                
                if(mes-1==3){
                    quantDias += 31;
                    mes--;
                }
                
                if(mes-1==2){
                    quantDias += 28;
                    mes--;
                }
                
                if(mes-1==1){
                    quantDias += 31;
                    mes--;
                }

                    System.out.print("\nQuantidade de dias: " + quantDias);
            }else{
                System.out.print("Impossível realizar o cálculo. Anos e/ou Meses inconsistentes");
            }
            */

            /*EXERCÍCIO 15 -

            System.out.print("Digite a quantidade de latas de 350ml: ");
            int lata350ml = teclado.nextInt();
            
            System.out.print("Digite a quantidade de garrafas de 600ml: ");
            int garrafa600ml = teclado.nextInt();

            System.out.print("Digite a quantidade de garrafas de 2l: ");
            int garrafa2L = teclado.nextInt();

            double litrosTotal = lata350ml*0.35 + garrafa600ml*0.60 + garrafa2L*2;
            
            System.out.printf("A quantidade total de litros é: %.2f\n",litrosTotal);

            double margemLucroTotalLata350 = 15*lata350ml;

            double margemLucroTotalGarrafa600 = 9*garrafa600ml;

            if(margemLucroTotalGarrafa600>=margemLucroTotalLata350){
                double quantEquivalenteGarrafa600 = (lata350ml*350f)/600f;
                System.out.printf("\nConsidere substituir a compra de:\n%d latas de 350 ml por %.2f garrafas de 600ml e oferecer uma promoção.",lata350ml,quantEquivalenteGarrafa600);
            }
            */

            /*EXERCÍCIO 16 -

            System.out.print("Digite um número de 4 dígitos: ");
            int numero = teclado.nextInt();
            
            if(numero>9999 || numero<0){
                System.out.print("Número inválido!");
            }else{
            int milhares = numero/1000;
            int centenas = (numero%1000)/100;
            int dezenas = (numero%100)/10;
            int unidades = numero%10;
            
            if(numero>999){
                System.out.println("\nMilhares: " + milhares);
                System.out.println("Centenas: " + centenas);
                System.out.println("Dezenas: " + dezenas);
                System.out.print("Unidades: " + unidades);
            }else if(numero>99){
                System.out.println("Centenas: " + centenas);
                System.out.println("Dezenas: " + dezenas);
                System.out.print("Unidades: " + unidades);
            }else if(numero>9){
                System.out.println("Dezenas: " + dezenas);
                System.out.print("Unidades: " + unidades);
            }else{
                System.out.print("Unidades: " + unidades);
            }
            }
            */

            /*EXERCÍCIO 17 -
		
            System.out.print("Digite a quantidade de sanduíches: ");
            int qtdeSanduiches = teclado.nextInt();

            System.out.print("Qual a quantidade em Kgs disponível de presunto? ");
            double qtdeDisponivelPresunto = teclado.nextDouble();
               
            double qtdeNecessariaMussarela = (100*qtdeSanduiches)/1000f;
            double qtdeNecessariaPresunto = (50*qtdeSanduiches)/1000f;
            double qtdeNecessariaHamburguer = (120*qtdeSanduiches)/1000f;

            if(qtdeDisponivelPresunto>qtdeNecessariaPresunto){
                System.out.println("\nPara produzir " + qtdeSanduiches + " sanduíches serão necessários:");
                
                System.out.printf("\n%.3fkg de mussarela",qtdeNecessariaMussarela);
                
                System.out.printf("\n%.3f kg de presunto",qtdeNecessariaPresunto);
                
                System.out.printf("\n%.3f kg de hamburguer",qtdeNecessariaHamburguer);
            }else{
                System.out.println("\nPara produzir " + qtdeSanduiches + " sanduíches serão necessários:");
            
                System.out.printf("\n%.3fkg de mussarela",qtdeNecessariaMussarela);
                
                System.out.printf("\n%.3f kg de presunto",qtdeNecessariaPresunto);
                
                System.out.printf("\n%.3f kg de hamburguer",qtdeNecessariaHamburguer);

                long qtdeSanduichePossivel = Math.round((qtdeDisponivelPresunto*1000)/50);

                int sanduicheRestante = qtdeSanduiches - Math.round(qtdeSanduichePossivel);

                double qtdMortadelaNecessaria = (70*sanduicheRestante)/1000f;

                double qtdePresuntoRestante = qtdeDisponivelPresunto - (50*qtdeSanduichePossivel)/1000f;

                System.out.printf("\nSerá possível produzir apenas %d sanduíches com presunto. Será necessário %.2f kgs de mortadela para produzir %d sanduíches restantes. Da quantidade de presunto disponível, sobrará %.2f kgs.",qtdeSanduichePossivel,qtdMortadelaNecessaria,sanduicheRestante,qtdePresuntoRestante);
            }
            */

            /*EXERCÍCIO 18 -

            System.out.print("Digite a quantidade total de horas normais: ");
            int qtdHorasNormais = teclado.nextInt();
            
            System.out.print("Digite a quantidade total de horas extras: ");
            int qtdHorasExtras = teclado.nextInt();
            
            System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
            int qtdDependentesMenores = teclado.nextInt();
            
            double valorHorasNormais = qtdHorasNormais * 10;
            System.out.printf("\nHoras normais: R$ %.2f",valorHorasNormais);
            
            double valorHorasExtras = qtdHorasExtras * 15f;
            System.out.printf("\nAdicional de Horas Extras: R$ %.2f", valorHorasExtras);
            
            double valorDependentes = 0;
            if(qtdDependentesMenores<=3){
                valorDependentes = qtdDependentesMenores * 90f;
                System.out.printf("\nAdicional de Dependentes: R$ %.2f", valorDependentes);
            }else{
                valorDependentes = 3 * 90f;
                System.out.printf("\nAdicional de Dependentes: R$ %.2f", valorDependentes);
            }
            double salarioLiquido = valorHorasNormais * 0.89;
            System.out.printf("\nSalário Líquido (horas normais - desconto): R$ %.2f", salarioLiquido);

            double salarioFinal = salarioLiquido + valorHorasExtras + valorDependentes;
            System.out.printf("\nSalário final: R$ %.2f",salarioFinal);
            
            if(qtdDependentesMenores>3){
                int dependentesNãoConsiderados = qtdDependentesMenores - 3;
             System.out.printf("\nSalário calculado para apenas 3 dependentes, os demais %d dependentes não receberão o auxilio.",dependentesNãoConsiderados);
            }
            */

            /*EXERCÍCIO 19 -

            System.out.print("Digite o valor do faturamento anterior: ");
            double faturamentoAnterior = teclado.nextDouble();
            
            System.out.println("\n===Código dos Produtos===");
            System.out.println("Produto 1:101");
            System.out.println("Produto 2:122");
            System.out.println("Produto 3:163");
            
            System.out.print("\nDigite o código do produto que se deseja bater a meta: ");
            int codigo = teclado.nextInt();

            if(codigo==101 || codigo==122 || codigo==163){
                double meta = faturamentoAnterior * 1.2;
                System.out.printf("\nA meta do próximo mês é: R$ %.2f",meta);
                            
                double aumento = meta - faturamentoAnterior;
                
                System.out.printf("\nUm aumento de R$ %.2f", aumento);
                
                System.out.println("\nQuantidade de peças a serem vendidas para atingir a meta:");
                if(codigo==101){
                    double produto1 = aumento/150;
                    System.out.printf("\nProduto 1: %.2f peças", produto1);
                }else if(codigo==122){
                    double produto2 = aumento/220;
                    System.out.printf("\nProduto 2: %.2f peças", produto2);
                }else if(codigo==163){
                    double produto3 = aumento/97;
                    System.out.printf("\nProduto 3: %.2f peças", produto3);
                }
            }else{
                System.out.print("\nCódigo de produto não encontrado!");
            }
            */
            
            /*EXERCÍCIO 20 -

            System.out.print("Digite a quantidade de pães vendidos: ");
            int paesVendidos = teclado.nextInt();
            
            System.out.print("Digite a quantidade de broas vendidas: ");
            int broasVendidas = teclado.nextInt();
            
            System.out.print("Digite o valor da reforma: ");
            double valorReforma = teclado.nextDouble();
            
            double valorBroas = broasVendidas * 1.6f;
            System.out.printf("Faturamento com a venda de broas: R$ %.2f", valorBroas);
            
            double valorPaes = paesVendidos * 0.12f;
            System.out.printf("\nFaturamento com a venda de pães: R$ %.2f", valorPaes);
            
            double faturaDiario = valorBroas + valorPaes;
            System.out.printf("\nFaturamento diário (pães + broas): R$ %.2f", faturaDiario);
            
            double deposito = faturaDiario * 0.1f;
            System.out.printf("\nValor do depósito na poupança: R$ %.2f", deposito);
            
            int diasPagar = (int)Math.ceil(valorReforma/deposito);
            System.out.printf("\nPara pagar a reforma serão necessários: %d dias", diasPagar);

            if(diasPagar>120){
                double valorReforma120Dias = valorReforma/120;
                System.out.printf("\n\nPara realizar a reforma em 120 dias será necessário depositar diariamente R$: %.2f",valorReforma120Dias);
            }
            */

            teclado.close();

        }
    }
