/*
 * ! ******************************************************************************
 *
 *  Pentaho Data Integration
 *
 *  Copyright (C) 2002-2017 by Pentaho : http://www.pentaho.com
 *
 * ******************************************************************************
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * *****************************************************************************
 */

package org.pentaho.di.engine.api.events;

import org.pentaho.di.engine.api.model.LogicalModelElement;
import org.pentaho.di.engine.api.model.Row;

import java.io.Serializable;
import java.util.List;

/**
 * A {@link PDIEvent} associated with a list of {@link Row} elements. This event contains the data, the
 * {@link LogicalModelElement} source, as well as the flow information (TYPE) and STATE, indicating
 * whether the datastream is still ACTIVE, has no remaining rows (COMPLETE) or is EMPTY.
 *
 * <p>
 * Created by nbaker on 5/30/16.
 */
public interface DataEvent<S extends LogicalModelElement, D extends Serializable & List<Row>> extends PDIEvent<S, D> {
  enum TYPE { IN, OUT, ERROR }

  enum STATE { ACTIVE, COMPLETE, EMPTY }

  TYPE getType();

  STATE getState();



}
