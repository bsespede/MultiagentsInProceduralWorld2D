package com.baru.survivor.frontend.sprite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.baru.survivor.Survivor;
import com.baru.survivor.backend.map.TileType;

public class SpriteGenerator {

	private Texture spriteSheet;
	private Map<TileType, SpriteSelector> spriteGenerator = new HashMap<TileType, SpriteSelector>();
	
	public void initialize() throws IOException{
		spriteSheet = new Texture(Gdx.files.internal(Survivor.spriteSheet));
		int[][] grass = {{175}, {176}, {177}, {178}, {179}, {180}, {181}, {182}, {183}, {184}, {185},
				{186}, {187}, {188}, {189}, {190}};
		int[][] grassDeco = {{1}, {2}};
		int[][] tree = {{5}};
		int[][] forest = {{6}};
		int[][] mountains = {{10}, {11}, {12}};
		int[][] plateaus = {{13}, {27}};
		int[][] houses = {{7}, {8}, {9}, {14}, {15}, {16}, {17}, {21}};
		int[][] lake = {{18, 19, 20}};
		int[][] tents = {{37}, {38}, {39}, {40}};
		int[][] villagers = {{245}, {246}, {249}, {250}, {251}, {252}, {253}, {258}, {259}, {260}};
		int[][] horse = {{108}};
		int[][] windmill = {{164, 165, 166, 167}};
		int[][] water = {{168, 169, 170, 171}};
		int[][] waterDeco = {{238}, {239}, {195}};
		int[][] shade = {{0}};
		int[][] selection = {{297}};
		int[][] skull = {{301}};
		int[][] food = {{153}};
		spriteGenerator.put(TileType.SELECTION, new SpriteSelector(spriteSheet, selection));
		spriteGenerator.put(TileType.SKULL, new SpriteSelector(spriteSheet, skull));
		spriteGenerator.put(TileType.SHADE, new SpriteSelector(spriteSheet, shade));
		spriteGenerator.put(TileType.VILLAGER, new SpriteSelector(spriteSheet, villagers));
		spriteGenerator.put(TileType.GRASS, new SpriteSelector(spriteSheet, grass));
		spriteGenerator.put(TileType.GRASS_DECORATION, new SpriteSelector(spriteSheet, grassDeco));
		spriteGenerator.put(TileType.TREE, new SpriteSelector(spriteSheet, tree));
		spriteGenerator.put(TileType.FOREST, new SpriteSelector(spriteSheet, forest));
		spriteGenerator.put(TileType.MOUNTAIN, new SpriteSelector(spriteSheet, mountains));
		spriteGenerator.put(TileType.PLATEAU, new SpriteSelector(spriteSheet, plateaus));
		spriteGenerator.put(TileType.HOUSE, new SpriteSelector(spriteSheet, houses));
		spriteGenerator.put(TileType.LAKE, new SpriteSelector(spriteSheet, lake));
		spriteGenerator.put(TileType.TENT, new SpriteSelector(spriteSheet, tents));
		spriteGenerator.put(TileType.HORSE, new SpriteSelector(spriteSheet, horse));
		spriteGenerator.put(TileType.WINDMILL, new SpriteSelector(spriteSheet, windmill));
		spriteGenerator.put(TileType.WATER, new SpriteSelector(spriteSheet, water));
		spriteGenerator.put(TileType.WATER_DECORATION, new SpriteSelector(spriteSheet, waterDeco));
		spriteGenerator.put(TileType.FOOD, new SpriteSelector(spriteSheet, food));
	}
	
	public SimpleSprite generateRandom(TileType type) {
		return spriteGenerator.get(type).getRandom();
	}
	
	public SimpleSprite generateIndex(TileType type, int index) {
		return spriteGenerator.get(type).getIndex(index);
	}

	public Texture getTexture() {
		return spriteSheet;
	}
}
