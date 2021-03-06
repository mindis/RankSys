/* 
 * Copyright (C) 2015 Information Retrieval Group at Universidad Autonoma
 * de Madrid, http://ir.ii.uam.es
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.uam.eps.ir.ranksys.nn.sim;

import es.uam.eps.ir.ranksys.fast.preference.FastPreferenceData;

/**
 * Vector Jaccard similarity.
 * 
 * sim(v, w) = v * w / (v * v + w * w - v * w)
 *
 * @author Saúl Vargas (saul.vargas@uam.es)
 */
public class VectorJaccardSimilarity extends VectorSimilarity {

    /**
     * Constructor.
     *
     * @param data preference data
     */
    public VectorJaccardSimilarity(FastPreferenceData<?, ?, ?> data) {
        super(data);
    }

    @Override
    protected double sim(double product, double norm2A, double norm2B) {
        return product / (norm2A + norm2B - product);
    }

}
