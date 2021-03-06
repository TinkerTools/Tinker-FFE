/*
 * <p>Title: Force Field Explorer</p>
 * <p>Description: Force Field Explorer Molecular Modeling Program</p>
 * <p>Copyright: Copyright (c) 2004-2020 Jay William Ponder</p>
 * <p>Institution: Jay Ponder Lab, Washington University in Saint Louis</p>
 * @author Michael J. Schnieders
 * @version 8.8
 */

package ffe.parsers;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/*
 * The ForceFieldFileFilter class is used to choose Tinker
 * Parameter (*.PRM) files
 */
public final class ForceFieldFileFilter extends FileFilter {
	/*
	 * Default Constructor
	 */
	public ForceFieldFileFilter() {
	}

	/*
	 * This method determines whether or not the parm File parameter
	 * is a Tinker *.key or not, returning true if it is. (Also returns
	 * true for any directory)
	 */
	public boolean accept(File parm) {
		if (parm.isDirectory()) {
			return true;
		}
		String filename = parm.getName();
		int dot = filename.lastIndexOf(".");
		if (filename.regionMatches(false, dot + 1, "prm", 0, 3)) {
			return true;
		}
		return false;
	}

	/*
	 * Provides a description of this FileFilter
	 */
	public String getDescription() {
		return new String("Tinker Parameter Files: *.prm");
	}
}
