package myproject.ms;

public class MSLayoutManager {

	protected static int layoutIndex = 3;

	public static int getLayoutIndex() {
		return layoutIndex;
	}

	public static void setLayoutIndex(int layoutIndex) {
		MSLayoutManager.layoutIndex = layoutIndex;
	}

	protected static char[][] msLayout = new char[layoutIndex][layoutIndex];

	public static char[][] getMsLayout() {
		return msLayout;
	}

	public void setMSLayout(String inputLayout[]) {

		// Set the mine index to the layout
		int mineIndex = -1;
		for (int i = 0; i < layoutIndex; i++) {
			// Get the mine index from iput
			mineIndex = inputLayout[i].indexOf("m");
			for (int j = 0; j < layoutIndex; j++) {

				if (mineIndex == j) {
					msLayout[i][j] = 'm';
					continue;
				}
				msLayout[i][j] = 'x';

			}
		}
	}
}
