/*
 * LensKit, an open source recommender systems toolkit.
 * Copyright 2010-2014 LensKit Contributors.  See CONTRIBUTORS.md.
 * Work on LensKit has been funded by the National Science Foundation under
 * grants IIS 05-34939, 08-08692, 08-12148, and 10-17697.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.lenskit.baseline;

import org.grouplens.lenskit.core.Shareable;
import org.grouplens.lenskit.core.Transient;
import org.lenskit.basic.ConstantItemScorer;
import org.lenskit.data.summary.RatingSummary;

import javax.inject.Inject;

/**
 * Item scorer that scores every item with the global mean rating.  It is not useful to use this scorer for
 * ranking items.
 */
@Shareable
public class GlobalMeanRatingItemScorer extends ConstantItemScorer {
    private static final long serialVersionUID = 1L;

    @Inject
    public GlobalMeanRatingItemScorer(@Transient RatingSummary summary) {
        super(summary.getGlobalMean());
    }
}