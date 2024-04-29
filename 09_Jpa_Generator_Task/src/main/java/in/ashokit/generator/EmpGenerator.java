package in.ashokit.generator;

import java.io.Serializable;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;

public class EmpGenerator implements IdentifierGenerator{
	
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "AIT";
        Query query = session.createQuery("SELECT MAX(e.eid) FROM Emp e WHERE e.eid LIKE :prefix");
        query.setParameter("prefix", prefix + "%");
        String maxExistingId = (String) query.uniqueResult();
        int counter = 1;
        if (maxExistingId != null) {
            // Extract the numeric part of the existing ID and increment it
            counter = Integer.parseInt(maxExistingId.substring(prefix.length())) + 1;
         }
	
        return prefix +counter;
        }

    }
	

