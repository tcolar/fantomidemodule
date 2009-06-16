/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author thibautc
 */
public class FanTokenID implements TokenId{
    private final String name;
    private final String category;
    private final int ordinal;

    public FanTokenID(String name, int ordinal, String category)
    {
	this.name=name;
	this.ordinal=ordinal;
	this.category=category;
    }

    public String name()
    {
	return name;
    }

    public int ordinal()
    {
	return ordinal;
    }

    public String primaryCategory()
    {
	return category;
    }

}
