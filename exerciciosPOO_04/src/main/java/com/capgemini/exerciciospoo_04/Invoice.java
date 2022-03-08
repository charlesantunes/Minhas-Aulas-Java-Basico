/*
 6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.
 */
package com.capgemini.exerciciospoo_04;

public class Invoice {

    private int numItemFaturado;
    private String descricaoItem;
    private int qtdCompraItem;
    private float precoItemUnid;

    public Invoice(int numItemFaturado, String descricaoItem, int qtdCompraItem, float precoItemUnid) {
        this.setNumItemFaturado(numItemFaturado);
        this.setDescricaoItem(descricaoItem);
        this.setQtdCompraItem(qtdCompraItem);
        this.setPrecoItemUnid(precoItemUnid);

    }

    public double getInvoiceAmount() {
        return qtdCompraItem * precoItemUnid;
    }

    public int getNumItemFaturado() {
        return numItemFaturado;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdCompraItem() {
        return qtdCompraItem;
    }

    public void setQtdCompraItem(int qtdCompraItem) {

        if (qtdCompraItem < 0) {
            this.qtdCompraItem = 0;
        } else {
            this.qtdCompraItem = qtdCompraItem;
        }

    }

    public float getPrecoItemUnid() {
        return precoItemUnid;
    }

    public void setPrecoItemUnid(float precoItemUnid) {
        if (precoItemUnid < 0) {
            this.precoItemUnid = 0;
        } else {
            this.precoItemUnid = precoItemUnid;
        }
    }

}
