
package org.xbib.elasticsearch.river.jdbc.support;

/**
 * Operations for indexing in Elasticsearch.
 *
 * @author Jörg Prante <joergprante@gmail.com>
 */
public interface Operations {

    String OP_CREATE = "create";
    String OP_INDEX = "index";
    String OP_DELETE = "delete";

}
