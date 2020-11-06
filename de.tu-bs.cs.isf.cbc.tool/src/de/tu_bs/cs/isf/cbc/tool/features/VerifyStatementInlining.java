package de.tu_bs.cs.isf.cbc.tool.features;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.tu_bs.cs.isf.cbc.cbcmodel.AbstractStatement;
import de.tu_bs.cs.isf.cbc.cbcmodel.ReturnStatement;
import de.tu_bs.cs.isf.cbc.cbcmodel.SkipStatement;
import de.tu_bs.cs.isf.cbc.cbcmodel.impl.AbstractStatementImpl;

public class VerifyStatementInlining extends VerifyStatement{

	public VerifyStatementInlining(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Verify a statement with inlining";
	}

	@Override
	public String getDescription() {
		return "Verifies a statement with inlining using the pre and post condition.";
	}
	
	@Override
	public void execute(ICustomContext context, IProgressMonitor monitor) {
		verifyStatement(context, monitor, true);
	}
}