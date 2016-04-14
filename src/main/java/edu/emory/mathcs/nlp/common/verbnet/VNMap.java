/**
 * Copyright 2015, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.nlp.common.verbnet;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class VNMap extends HashMap<String,VNClass> implements Serializable
{
	private static final long serialVersionUID = -7409938151707095231L;
	
	public void put(VNClass vn)
	{
		put(vn.getID(), vn);
	}
}